package se.lexicon.thymeleaf_exercises.dto;

import java.util.Objects;

public class TempService {
    private String fever;
    private String normaltemp;
    private String hypothermia;

    public TempService() {
    }
    public TempService(String fever,String normaltemp,String hypothermia){
        this.fever=fever;
        this.normaltemp=normaltemp;
        this.hypothermia=hypothermia;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getNormaltemp() {
        return normaltemp;
    }

    public void setNormaltemp(String normaltemp) {
        this.normaltemp = normaltemp;
    }

    public String getHypothermia() {
        return hypothermia;
    }

    public void setHypothermia(String hypothermia) {
        this.hypothermia = hypothermia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempService that = (TempService) o;
        return Objects.equals(fever, that.fever) && Objects.equals(normaltemp, that.normaltemp) && Objects.equals(hypothermia, that.hypothermia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fever, normaltemp, hypothermia);
    }

    @Override
    public String toString() {
        return "TempService{" +
                "fever='" + fever + '\'' +
                ", normaltemp='" + normaltemp + '\'' +
                ", hypothermia='" + hypothermia + '\'' +
                '}';
    }
}
