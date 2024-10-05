class Badge {
    public String print(Integer id, String name, String department) {
        String id_print = "";
        if( id != null) {
            id_print += "[" + id + "] - ";
        }
        id_print += name;
        if( department != null) {
            id_print += " - " + department.toUpperCase();
        } else {
            id_print += " - OWNER";
        }
        return id_print;
    }
}
