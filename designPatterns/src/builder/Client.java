package creational.builder;

public class Client {
    public static void main(String[] args){

        Student obj= Student.builder()
                .setId(1)
                .setName("Bhakti")
                .setGradYear(2022)
                .setBatchName("LLD-June22")
                .setYoe(1)
                .setPsp(95)
                .build();

        System.out.println(obj);
    }
}
