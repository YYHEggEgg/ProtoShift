@ECHO OFF

:: 0) Backup Handler.java & HandlerGetPlayerTokenReq.java & HandlerGetPlayerTokenRsp.java & HandlerUnionCmdNotify.java

md ".\backup"

move /Y ".\src\main\java\emu\grasscutter\server\packet\recv\Handler.java" ".\backup\Handler.recv.java"
move /Y ".\src\main\java\emu\grasscutter\server\packet\recv\HandlerUnionCmdNotify.java" ".\backup\HandlerUnionCmdNotify.java"
move /Y ".\src\main\java\emu\grasscutter\server\packet\recv\HandlerGetPlayerTokenReq.java" ".\backup\HandlerGetPlayerTokenReq.java"
move /Y ".\src\main\java\emu\grasscutter\server\packet\send\Handler.java" ".\backup\Handler.send.java"
move /Y ".\src\main\java\emu\grasscutter\server\packet\send\HandlerGetPlayerTokenRsp.java" ".\backup\HandlerGetPlayerTokenRsp.java"


:: 1) Clean exist files
del /Q ".\src\main\java\emu\grasscutter\server\packet\recv"
del /Q ".\src\main\java\emu\grasscutter\server\packet\send"

if not exist ".\src\main\java\emu\grasscutter\server\packet\recv" md ".\src\main\java\emu\grasscutter\server\packet\recv"
if not exist ".\src\main\java\emu\grasscutter\server\packet\send" md ".\src\main\java\emu\grasscutter\server\packet\send"


:: 2) Updata Opcodes

cd tools\opcode_shift
python opcode_shift.py
cd ..\..\


:: 3) Build proto

cd tools\Sorapointa2Grasscutter
python Sorapointa2Grasscutter.py
cd ..\..\

del /Q ".\src\generated"

if not exist ".\src\generated\" md ".\src\generated"

.\tools\protoc\protoc.exe -I=".\proto\new" --java_out=".\src\generated" ".\proto\new\*.proto"
.\tools\protoc\protoc.exe -I=".\proto\old" --java_out=".\src\generated" ".\proto\old\*.proto"


:: 4) Translate proto to json

cd tools\proto2json
proto2json.exe
cd ..\..\


:: 5) Translate json to java

cd tools\protojson2java
python protojson2java.py
cd ..\..\


:: 6) Recover Handler.java & HandlerGetPlayerTokenReq.java & HandlerGetPlayerTokenRsp.java & HandlerUnionCmdNotify.java

move /Y ".\backup\Handler.recv.java" ".\src\main\java\emu\grasscutter\server\packet\recv\Handler.java"
move /Y ".\backup\HandlerUnionCmdNotify.java" ".\src\main\java\emu\grasscutter\server\packet\recv\HandlerUnionCmdNotify.java"
move /Y ".\backup\HandlerGetPlayerTokenReq.java" ".\src\main\java\emu\grasscutter\server\packet\recv\HandlerGetPlayerTokenReq.java"
move /Y ".\backup\Handler.send.java" ".\src\main\java\emu\grasscutter\server\packet\send\Handler.java"
move /Y ".\backup\HandlerGetPlayerTokenRsp.java" ".\src\main\java\emu\grasscutter\server\packet\send\HandlerGetPlayerTokenRsp.java"

rd /Q ".\backup"