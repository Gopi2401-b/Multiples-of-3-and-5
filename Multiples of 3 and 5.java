for (int j = 0; j < numInputs; j++) {
    int size = sc.nextInt();
    int sum = 0;
    for (int i = 1; i < size; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);
}
