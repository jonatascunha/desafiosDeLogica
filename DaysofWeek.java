public enum DaysofWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    public int dayWeek;

    DaysofWeek(int dayWeek) {
        this.dayWeek = dayWeek;
    }

    public int getDayWeek() {
        return dayWeek;
    }
}
