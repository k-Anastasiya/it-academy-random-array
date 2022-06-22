public class RandomArray {
    int size;

    int numberFirst;
    int numberSacond;

    public RandomArray(int size, int numberFirst, int numberSacond) {
        this.size = size;
        this.numberFirst = numberFirst;
        this.numberSacond = numberSacond;
    }


    public int[] createRandomArray(int size, int numberFirst, int numberSacond) {

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * (numberSacond - numberFirst) + numberFirst));
        }
        return array;
    }

    public int setRandomArray(int[] array) {
        int numberPositive = 0;

        for (int number : array) {
            if (number % 2 != 0 && number > 0) {
                numberPositive++;


            }
        }
        return numberPositive;
    }

}

