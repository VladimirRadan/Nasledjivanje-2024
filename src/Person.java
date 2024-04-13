public class Person {

    protected String ime;
    protected String prezime;

    public Person(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    private String ispis(){
        return "Ispis";
    }

  public void ispisPerson(){
      System.out.println(ispis() + " " +  ime + " " + prezime);
  }


}
