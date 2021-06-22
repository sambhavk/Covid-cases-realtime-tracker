package io.javabrainsproject.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diff;

    /**
     * @return the diff
     */
    public int getDiff() {
        return diff;
    }

    /**
     * @param diff the diff to set
     */
    public void setDiff(int diff) {
        this.diff = diff;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the latestTotalCases
     */
    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param latestTotalCases the latestTotalCases to set
     */
    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "LocationStats [country=" + country + ", state=" + state + ", latestTotalCases=" + latestTotalCases
                + "]";
    }
}
