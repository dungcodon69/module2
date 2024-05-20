package minitest;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook(1,"Head First Java",200,
                "Kathy Sierra", "Java","No framework");
        books[1] = new ProgrammingBook(2,"C# in Depth",100,
                "Jon Skeet", "C#","No framework");
        books[2] = new ProgrammingBook(3,"Javascript Framework",120,
                "John Doe","Javascript","NodeJS");

        books[3] = new FictionBook(4,"Fiction Book 1",300,
                "Micheal","Fiction 1");
        books[4] = new FictionBook(5,"Fiction Book 2",350,
                "Drake","Fiction 2");
        books[5] = new FictionBook(6,"Fiction Book 3",50,
                "Clinton","Fiction 1");

        System.out.println("Total money: " + calSum(books));
        System.out.println("Number of Java book: "+ numberOfJavaBook(books));
        System.out.println("Number of Fiction book in Fiction 1 category: " + numberOfFiction1Book(books));
        System.out.println("The fiction book have price less than 100: " + fictionBookLessThan100(books));


    }
    public static double calSum(Book[] books){
        double sum = 0;
        for (Book b :
                books) {
//            System.out.print("Book name: " + b.getName() + ", price: " + b.getPrice());
//            if (b instanceof ProgrammingBook){
//                ProgrammingBook p = (ProgrammingBook) b;
//                sum += p.getAmount();
//                System.out.print(", after discount: " + p.getAmount());
//            }
//            else if (b instanceof FictionBook){
//                FictionBook p = (FictionBook) b;
//                sum += p.getAmount();
//                System.out.print(", after discount: " + p.getAmount());
//            }
//            System.out.println();
            sum += b.getAmount();
        }
        return sum;
    }

    public static int numberOfJavaBook(Book[] books){
        int amountOfJavaBook = 0;
        for (Book b :
                books) {
            if (b instanceof ProgrammingBook) {
                if (((ProgrammingBook) b).getLanguage().equals("Java")){
                    amountOfJavaBook++;
                }
            }
        }
        return amountOfJavaBook;
    }

    public static int numberOfFiction1Book(Book[] books){
        int numberOfFiction1Book = 0;
        for (Book b :
                books) {
            if (b instanceof FictionBook) {
                if (((FictionBook) b).getCategory().equals("Fiction 1")){
                    numberOfFiction1Book++;
                }
            }
        }
        return numberOfFiction1Book;
    }
    public static int fictionBookLessThan100(Book[] books){
        int fictionBookPriceLessThan100 = 0;
        for (Book b :
                books) {
            if (b instanceof FictionBook) {
                if (b.getPrice() < 100){
                    fictionBookPriceLessThan100++;
                }
            }
        }
        return fictionBookPriceLessThan100;
    }
}
