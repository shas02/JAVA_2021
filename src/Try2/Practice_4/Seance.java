package Try2.Practice_4;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;

        int endHours = startTime.getHours() + movie.getDuration().getHours();
        int endMin = startTime.getMin() + movie.getDuration().getMin();

        if (endMin > 59) {
            ++endHours;
            endMin = 0;
        }
        

        this.endTime = new Time(endHours, endMin);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Seance s) {
        return this.getStartTime().getHours() - s.getStartTime().getHours();
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
