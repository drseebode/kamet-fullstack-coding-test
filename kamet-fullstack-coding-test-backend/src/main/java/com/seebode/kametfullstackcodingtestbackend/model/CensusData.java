package com.seebode.kametfullstackcodingtestbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "census")
public class CensusData {


        @Id
        String id;
        @Field("age") int age;
        @Field("classofworker") String classofworker;
    @Field("industrycode")String industrycode;
    @Field("occupationcode")String occupationcode;
        @Field("education") String  education;
    @Field("wageperhour")String  wageperhour;
    @Field("lasteducation")String  lasteducation;
    @Field("maritalstatus")String  maritalstatus;
    @Field("majorindustrycode")String  majorindustrycode;
    @Field("majoroccupationcode")String  majoroccupationcode;
    @Field("mace")String  mace;
    @Field("hispanice")String  hispanice;
    @Field("sex")String  sex;
    @Field("memberoflabor")String  memberoflabor;
    @Field("reasonforunemployment")String  reasonforunemployment;
    @Field("fulltime")String  fulltime;
    @Field("capitalgain")String  capitalgain;
    @Field("capitalloss")String  capitalloss;
    @Field("dividends")String  dividends;
        @Field("incometaxliability")String  incometaxliability;
    @Field("previousresidenceregion")String  previousresidenceregion;
    @Field("previousresidencestate")String  previousresidencestate;
        @Field("householdwithfamily") String  householdwithfamily;
    @Field("householdsimple")String  householdsimple;
    @Field("weight")String  weight;
    @Field("msachange")String  msachange;
    @Field("regchange")String  regchange;
    @Field("withinregchange")String  withinregchange;
    @Field("livedhere")String  livedhere;
    @Field("migrationprevresinsunbelt")String  migrationprevresinsunbelt;
    @Field("numpersonsworkedforemployer")String  numpersonsworkedforemployer;
    @Field("familymembersunder118")String  familymembersunder118;
    @Field("fatherbirthcountry")String  fatherbirthcountry;
    @Field("motherbirthcountry")String  motherbirthcountry;
    @Field("birthcountry")String  birthcountry;
    @Field("citizenship")String  citizenship;
    @Field("ownbusinessorselfemployed")String  ownbusinessorselfemployed;
    @Field("fillquestionnaireforveteransadmin")String  fillquestionnaireforveteransadmin;
    @Field("veteransbenefits")String  veteransbenefits;
    @Field("weeksworkedinyear")String  weeksworkedinyear;
    @Field("year")String  year;
    @Field("salaryrange")String  salaryrange;


    public CensusData() {
    }

    public CensusData(String id, int age, String classofworker, String industrycode, String occupationcode, String education, String wageperhour, String lasteducation, String maritalstatus, String majorindustrycode, String majoroccupationcode, String mace, String hispanice, String sex, String memberoflabor, String reasonforunemployment, String fulltime, String capitalgain, String capitalloss, String dividends, String incometaxliability, String previousresidenceregion, String previousresidencestate, String householdwithfamily, String householdsimple, String weight, String msachange, String regchange, String withinregchange, String livedhere, String migrationprevresinsunbelt, String numpersonsworkedforemployer, String familymembersunder118, String fatherbirthcountry, String motherbirthcountry, String birthcountry, String citizenship, String ownbusinessorselfemployed, String fillquestionnaireforveteransadmin, String veteransbenefits, String weeksworkedinyear, String year, String salaryrange) {
        this.id = id;
        this.age = age;
        this.classofworker = classofworker;
        this.industrycode = industrycode;
        this.occupationcode = occupationcode;
        this.education = education;
        this.wageperhour = wageperhour;
        this.lasteducation = lasteducation;
        this.maritalstatus = maritalstatus;
        this.majorindustrycode = majorindustrycode;
        this.majoroccupationcode = majoroccupationcode;
        this.mace = mace;
        this.hispanice = hispanice;
        this.sex = sex;
        this.memberoflabor = memberoflabor;
        this.reasonforunemployment = reasonforunemployment;
        this.fulltime = fulltime;
        this.capitalgain = capitalgain;
        this.capitalloss = capitalloss;
        this.dividends = dividends;
        this.incometaxliability = incometaxliability;
        this.previousresidenceregion = previousresidenceregion;
        this.previousresidencestate = previousresidencestate;
        this.householdwithfamily = householdwithfamily;
        this.householdsimple = householdsimple;
        this.weight = weight;
        this.msachange = msachange;
        this.regchange = regchange;
        this.withinregchange = withinregchange;
        this.livedhere = livedhere;
        this.migrationprevresinsunbelt = migrationprevresinsunbelt;
        this.numpersonsworkedforemployer = numpersonsworkedforemployer;
        this.familymembersunder118 = familymembersunder118;
        this.fatherbirthcountry = fatherbirthcountry;
        this.motherbirthcountry = motherbirthcountry;
        this.birthcountry = birthcountry;
        this.citizenship = citizenship;
        this.ownbusinessorselfemployed = ownbusinessorselfemployed;
        this.fillquestionnaireforveteransadmin = fillquestionnaireforveteransadmin;
        this.veteransbenefits = veteransbenefits;
        this.weeksworkedinyear = weeksworkedinyear;
        this.year = year;
        this.salaryrange = salaryrange;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassofworker() {
        return classofworker;
    }

    public void setClassofworker(String classofworker) {
        this.classofworker = classofworker;
    }

    public String getIndustrycode() {
        return industrycode;
    }

    public void setIndustrycode(String industrycode) {
        this.industrycode = industrycode;
    }

    public String getOccupationcode() {
        return occupationcode;
    }

    public void setOccupationcode(String occupationcode) {
        this.occupationcode = occupationcode;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWageperhour() {
        return wageperhour;
    }

    public void setWageperhour(String wageperhour) {
        this.wageperhour = wageperhour;
    }

    public String getLasteducation() {
        return lasteducation;
    }

    public void setLasteducation(String lasteducation) {
        this.lasteducation = lasteducation;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getMajorindustrycode() {
        return majorindustrycode;
    }

    public void setMajorindustrycode(String majorindustrycode) {
        this.majorindustrycode = majorindustrycode;
    }

    public String getMajoroccupationcode() {
        return majoroccupationcode;
    }

    public void setMajoroccupationcode(String majoroccupationcode) {
        this.majoroccupationcode = majoroccupationcode;
    }

    public String getMace() {
        return mace;
    }

    public void setMace(String mace) {
        this.mace = mace;
    }

    public String getHispanice() {
        return hispanice;
    }

    public void setHispanice(String hispanice) {
        this.hispanice = hispanice;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMemberoflabor() {
        return memberoflabor;
    }

    public void setMemberoflabor(String memberoflabor) {
        this.memberoflabor = memberoflabor;
    }

    public String getReasonforunemployment() {
        return reasonforunemployment;
    }

    public void setReasonforunemployment(String reasonforunemployment) {
        this.reasonforunemployment = reasonforunemployment;
    }

    public String getFulltime() {
        return fulltime;
    }

    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    public String getCapitalgain() {
        return capitalgain;
    }

    public void setCapitalgain(String capitalgain) {
        this.capitalgain = capitalgain;
    }

    public String getCapitalloss() {
        return capitalloss;
    }

    public void setCapitalloss(String capitalloss) {
        this.capitalloss = capitalloss;
    }

    public String getDividends() {
        return dividends;
    }

    public void setDividends(String dividends) {
        this.dividends = dividends;
    }

    public String getIncometaxliability() {
        return incometaxliability;
    }

    public void setIncometaxliability(String incometaxliability) {
        this.incometaxliability = incometaxliability;
    }

    public String getPreviousresidenceregion() {
        return previousresidenceregion;
    }

    public void setPreviousresidenceregion(String previousresidenceregion) {
        this.previousresidenceregion = previousresidenceregion;
    }

    public String getPreviousresidencestate() {
        return previousresidencestate;
    }

    public void setPreviousresidencestate(String previousresidencestate) {
        this.previousresidencestate = previousresidencestate;
    }

    public String getHouseholdwithfamily() {
        return householdwithfamily;
    }

    public void setHouseholdwithfamily(String householdwithfamily) {
        this.householdwithfamily = householdwithfamily;
    }

    public String getHouseholdsimple() {
        return householdsimple;
    }

    public void setHouseholdsimple(String householdsimple) {
        this.householdsimple = householdsimple;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMsachange() {
        return msachange;
    }

    public void setMsachange(String msachange) {
        this.msachange = msachange;
    }

    public String getRegchange() {
        return regchange;
    }

    public void setRegchange(String regchange) {
        this.regchange = regchange;
    }

    public String getWithinregchange() {
        return withinregchange;
    }

    public void setWithinregchange(String withinregchange) {
        this.withinregchange = withinregchange;
    }

    public String getLivedhere() {
        return livedhere;
    }

    public void setLivedhere(String livedhere) {
        this.livedhere = livedhere;
    }

    public String getMigrationprevresinsunbelt() {
        return migrationprevresinsunbelt;
    }

    public void setMigrationprevresinsunbelt(String migrationprevresinsunbelt) {
        this.migrationprevresinsunbelt = migrationprevresinsunbelt;
    }

    public String getNumpersonsworkedforemployer() {
        return numpersonsworkedforemployer;
    }

    public void setNumpersonsworkedforemployer(String numpersonsworkedforemployer) {
        this.numpersonsworkedforemployer = numpersonsworkedforemployer;
    }

    public String getFamilymembersunder118() {
        return familymembersunder118;
    }

    public void setFamilymembersunder118(String familymembersunder118) {
        this.familymembersunder118 = familymembersunder118;
    }

    public String getFatherbirthcountry() {
        return fatherbirthcountry;
    }

    public void setFatherbirthcountry(String fatherbirthcountry) {
        this.fatherbirthcountry = fatherbirthcountry;
    }

    public String getMotherbirthcountry() {
        return motherbirthcountry;
    }

    public void setMotherbirthcountry(String motherbirthcountry) {
        this.motherbirthcountry = motherbirthcountry;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getOwnbusinessorselfemployed() {
        return ownbusinessorselfemployed;
    }

    public void setOwnbusinessorselfemployed(String ownbusinessorselfemployed) {
        this.ownbusinessorselfemployed = ownbusinessorselfemployed;
    }

    public String getFillquestionnaireforveteransadmin() {
        return fillquestionnaireforveteransadmin;
    }

    public void setFillquestionnaireforveteransadmin(String fillquestionnaireforveteransadmin) {
        this.fillquestionnaireforveteransadmin = fillquestionnaireforveteransadmin;
    }

    public String getVeteransbenefits() {
        return veteransbenefits;
    }

    public void setVeteransbenefits(String veteransbenefits) {
        this.veteransbenefits = veteransbenefits;
    }

    public String getWeeksworkedinyear() {
        return weeksworkedinyear;
    }

    public void setWeeksworkedinyear(String weeksworkedinyear) {
        this.weeksworkedinyear = weeksworkedinyear;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSalaryrange() {
        return salaryrange;
    }

    public void setSalaryrange(String salaryrange) {
        this.salaryrange = salaryrange;
    }
}
