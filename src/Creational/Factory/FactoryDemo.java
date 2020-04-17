package Creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteTypeEnum.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteTypeEnum.SHOP);
        System.out.println(site.getPages());
    }
}
