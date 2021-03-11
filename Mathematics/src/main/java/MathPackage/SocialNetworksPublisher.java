package MathPackage;

public class SocialNetworksPublisher {



    String siteUrl;
    String postText;
    String postTags;
    String imageLocalPath;
    int data;


    public static void main(String[] args) {

        networkVK vk = new networkVK();

        SocialNetworksPublisher snp = new SocialNetworksPublisher();
//        SocialNetworksPublisher snp;
        snp.startingPublishing();

        System.out.println("snp = " + snp);
        System.out.println("siteUrl = " + snp.siteUrl);
        System.out.println("siteUrl = " + snp.data);
//        vk.setVkPost("jdljdlsfjs", "jdfjslfksdfs");


    }
/*
    SocialNetworksPublisher() {

    }
*/


    void startingPublishing() {
        System.out.println("Start");
    }
}

class networkVK{

    String siteUrl;
    String postText;

    networkVK()
    {

    }

    public void setVkPost(String siteUrl, String postText) {

        this.siteUrl = siteUrl;
        this.postText = postText;
    }

}
