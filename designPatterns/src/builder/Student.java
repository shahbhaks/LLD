package creational.builder;

import creational.builder.exceptions.InvalidNameException;
import creational.builder.exceptions.InvalidgradYearException;
import creational.builder.exceptions.InvalidyoeException;

//1.Builder Pattern-Step by step obj creation
//complex obj creation
public class Student {

    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    static class Builder {

        private int id;
        private String name; //validate->  name!=null
        private int yoe;  //validate-> yoe>=1
        private int gradYear; //validate-> gradYear>=2020
        private double psp;
        private String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;

        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;

        }

        public void validate(){
            if(name==null){
                throw new InvalidNameException("Name should not be null");
            }
            if(yoe<1){
                throw new InvalidyoeException("Years of experience should not be zero");
            }
            if(gradYear>2022){
                throw new InvalidgradYearException("Grad year should be 2022 or before");
            }
        }

        public Student build(){
            this.validate();
            return new Student(this);
        }
    }

}
