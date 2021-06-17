package L1;

import c306.GUIHelper;

public class BiddingResult {

    private final String category;
    private final int year;
    private final String month;
    private final int round;
    private final int quota;
    private final int bidders;
    private final double premium;

    public BiddingResult(String category, int year, String month,
                         int round, int quota, int bidders, double premium) {
        this.category = category;
        this.year = year;
        this.month = month;
        this.round = round;
        this.quota = quota;
        this.bidders = bidders;
        this.premium = premium;
    }

    public double getPremium() {
        return premium;
    }

    public int getRound() {
        return round;
    }

    public int getBidders() {
        return bidders;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public boolean isThisBid(int year, String month, int round) {
        return (this.year == year) &&
                (this.month.equals(month)) &&
                (this.round == round);
    }

    public void display() {
        GUIHelper.output("Catagory : " + category);
        GUIHelper.output("Year     : " + year);
        GUIHelper.output("Month    : " + month);
        GUIHelper.output("Round    : " + round);
        GUIHelper.output("Quota    : " + quota);
        GUIHelper.output("Bidders  : " + bidders);
        GUIHelper.output("Premium  : " + premium);
    }
}
