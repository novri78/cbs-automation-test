package feature.setupRole;

public class RoleXpath {
    //XPath for show List
    public static String userManagement = "/html/body/div/div/div[1]/div[3]/div/div/button/div";
    public static String userAccessSetup = "/html/body/div/div/div[1]/div[3]/div/div/div/div[1]/button/div";
    public static String setupRole = "/html/body/div/div/div[1]/div[3]/div/div/div/div[1]/div/div[1]/button/div";
    //Xpath for create Role
    public static String tambahRole = "//span[normalize-space()='Role']";
    public static String namaRole = "//div[@class='flex flex-row flex-wrap justify-between w-full items-center mt-2']//input[@type='text']";
    public static String userLevel = "select";
    public static String printCheckBox = "(//span[@class='check is-success'])[1]";
    public static String clickSimpan = "(//span[normalize-space()='Simpan'])[1]";
    public static String okPopup = "/html/body/div[12]/div[2]/footer/button[2]";
    //detailRole
    public static String aksiButton = "/html/body/div[1]/div/div[2]/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[3]/div";
    public static String klikDetail = "/html/body/div[2]/div/div/div/a[2]";
    public static String backToListRole = "(//span[normalize-space()='Batal'])[1]";


}
