class Person {
    private String fname;
    private String lname;
    private String phnNo;
    private int zipCode;
    private String relation;
    private Relationship relationship;
    public Person(String fname, String lname, String phnNo, int zipCode, String relation) {
        this.fname = fname;
        this.lname = lname;
        this.phnNo = phnNo;
        this.zipCode = zipCode;
        this.relationship = Relationship.fromString(relation);
    }
//    public static Person createPerson(String fname, String lname, String phnNo, int zipCode, String relation) {
//        return new Person(fname, lname, phnNo, zipCode, relation);
//    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phnNo='" + phnNo + '\'' +
                ", zipCode=" + zipCode +
                ", relation=" + relationship +
                '}';
    }
}
enum Relationship {
    FAMILY("family"),
    FRIENDS("friends"),
    ASSOCIATES("associates"),
    COLLEAGUES("colleagues");

    private final String relation;

    Relationship(String relation) {
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public static Relationship fromString(String text) {
        for (Relationship relationship : Relationship.values()) {
            if (relationship.relation.equalsIgnoreCase(text)) {
                return relationship;
            }
        }
        //We will learn later
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}