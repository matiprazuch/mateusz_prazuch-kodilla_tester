public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("600g", 2000, 2018);
        Notebook notebook2 = new Notebook("2000g", 3500, 2020);
        Notebook notebook3 = new Notebook("1200g", 500,2016);
        Notebook notebook4 = new Notebook("2800g", 1400, 2017);

        checkNotebookParameters(notebook1);
        checkNotebookParameters(notebook2);
        checkNotebookParameters(notebook3);
        checkNotebookParameters(notebook4);
    }

    private static void checkNotebookParameters(Notebook notebook) {
        System.out.println("Weight: " + notebook.weight + ", Price: " + notebook.price + ", Year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
    }
}
