void main() {

    Scanner Lecture = new Scanner(System.in);

    int[] dadesa = new int[5];
    for (int i = 0; i <= 4; i++) {
        dadesa[i] = Lecture.nextInt();
    }

    int[] dadesb = new int[5];
    for (int i = 0; i <= 4; i++) {
        dadesb[i] = Lecture.nextInt();
    }

    int[] suma = new int[dadesa.length];
    for (int i = 0; i < dadesa.length; i++) {
        suma[i] = dadesa[i] + dadesb[i];
    }
    for (int i = 0; i < dadesa.length; i++) {
        System.out.println(dadesa[i] + "   " + dadesb[i] + "   " + suma[i]);
    }
}
