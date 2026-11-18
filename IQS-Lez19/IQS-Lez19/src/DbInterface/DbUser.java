package DbInterface;

public class DbUser {
    private static DbUser instance = new DbUser();
    private String schemaName;
    private String userName;
    private String pwd;

    private DbUser() {
        schemaName = "corso";
        userName = "root";
        pwd = "<INSERIRE QUI LA VOSTRA PASSWORD DI ROOT>";
    }

    public static DbUser getInstance() {
        return instance;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }
}
