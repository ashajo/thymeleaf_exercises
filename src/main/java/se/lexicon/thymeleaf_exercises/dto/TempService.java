package se.lexicon.thymeleaf_exercises.dto;

import java.util.Objects;

public class TempService {
    public int temp;

    public TempService() {
    }
    public String getTemperature(){
        if(temp>37){
            return "Fever Positive";
        }
        return "Negative";
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp=temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempService that = (TempService) o;
        return temp == that.temp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp);
    }

    @Override
    public String toString() {
        return "TempService{" +
                "temp=" + temp +
                '}';
    }
}
