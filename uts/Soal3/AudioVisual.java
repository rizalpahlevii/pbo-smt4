public class AudioVisual extends Resource {
    String productionCompany, type;
    Integer yearOfRelease;

    public String getProductionCompany() {
        return productionCompany;
    }

    public String getType() {
        return type;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

}
