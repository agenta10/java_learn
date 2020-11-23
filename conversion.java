class conv {
    public static void main(String[] args) {
        int y=3;
        float x=y; //no error cz no data loss
        x=3.4f   ;  // no error
    //  y=x      ;     error narrowing varibale x
    //  y=3.5    ;       error 3.5 is by default double
        x=3.5f;  //it is fine 
    }
}