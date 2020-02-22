package cn.pinming.siteagent.enums;

/**
 * @Auther: 36560
 * @Date: 2020/2/13 :14:03
 * @Description:登录类型 重定向 ，json
 */
public enum LoginType {
    HTML("HTML","网页"),
    JSON("JSON","json类型")
    ;
    private String type;

    private String discription;

    LoginType(String type, String discription) {
        this.type = type;
        this.discription = discription;
    }

    public String getType() {
        return type;
    }

    public String getDiscription() {
        return discription;
    }
}
