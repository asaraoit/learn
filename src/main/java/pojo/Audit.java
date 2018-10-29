package pojo;

import java.io.Serializable;

public class Audit implements Serializable {

    private String id;
    private String system;
    private String subSystem;
    private String Vendor;
    private Long dLogTime;
    private String sRightName;
    private String rightNo;
    private String sUrl;
    private Long iCostTime;
    private String sInputSearch;
    private String sOutParam;
    private String sStaffAccount;
    private String sIpAddress;
    private String sContent;

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    private String extention;

    public String getsOutParam() {
        return sOutParam;
    }

    public void setsOutParam(String sOutParam) {
        this.sOutParam = sOutParam;
    }

    public String getsStaffAccount() {
        return sStaffAccount;
    }

    public void setsStaffAccount(String sStaffAccount) {
        this.sStaffAccount = sStaffAccount;
    }

    public String getsIpAddress() {
        return sIpAddress;
    }

    public void setsIpAddress(String sIpAddress) {
        this.sIpAddress = sIpAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getSubSystem() {
        return subSystem;
    }

    public void setSubSystem(String subSystem) {
        this.subSystem = subSystem;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public Long getdLogTime() {
        return dLogTime;
    }

    public void setdLogTime(Long dLogTime) {
        this.dLogTime = dLogTime;
    }

    public String getsRightName() {
        return sRightName;
    }

    public void setsRightName(String sRightName) {
        this.sRightName = sRightName;
    }

    public String getRightNo() {
        return rightNo;
    }

    public void setRightNo(String rightNo) {
        this.rightNo = rightNo;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl;
    }

    public Long getiCostTime() {
        return iCostTime;
    }

    public void setiCostTime(Long iCostTime) {
        this.iCostTime = iCostTime;
    }

    public String getsInputSearch() {
        return sInputSearch;
    }

    public void setsInputSearch(String sInputSearch) {
        this.sInputSearch = sInputSearch;
    }
}
