#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

public class ${NAME}{
private ${NAME}() {}
    private static class ${NAME}Handler{
        private static ${NAME} singleton = new ${NAME}();
    }
    public static ${NAME} getInstance() {
        return ${NAME}Handler.singleton;
    }
}