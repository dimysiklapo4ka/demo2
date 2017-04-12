package internalClasses;

/**
 * Created by d1mys1klapo4ka on 06.04.2017.
 */

final class Executors {

    private Executors(){
        throw new UnsupportedOperationException("Запрет на создание класса.");
    }

    private static class Nested implements Executable{

        @Override
        public void execute() {
            System.out.println("Nested class.");
        }

        private class Inner extends Nested {

            @Override
            public void execute() {
                System.out.println("Inner class.");
            }
        }
    }

    static Executable getLocal(){
        class Local implements Executable{

            @Override
            public void execute() {
                System.out.println("Local class.");
            }
        }
        return new Local();
    }

    static Executable getAnonim(){

        return new Executable() {
            @Override
            public void execute() {
                System.out.println("Anonimous class.");
            }
        };
    }

    static Executable getInner(){

        return new Nested().new Inner();
    }

    static Executable getNested(){
        return new Nested();
    }
}
