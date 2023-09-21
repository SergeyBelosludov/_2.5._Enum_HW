package transport;

public enum BusCapacityByNumberOfSeats {
    EXTRA_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 60),
    LARGE(60, 80),
    EXTRA_LARGE(100, 120);

    private Integer from;
    private Integer to;

    BusCapacityByNumberOfSeats(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        if (from == null) {
            return "Вместимость до " + to + " мест";
        } else if (to == null) {
            return "Вместимость от " + from + " мест";
        }
        else {
            return "Вместимость " + from + " - " + to + " мест";
        }
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public void setTo(Integer to) {
        this.to = to;
    }
}