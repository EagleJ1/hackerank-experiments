package com.hackerrank.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static com.hackerrank.test.Masking.maskedEmail;
import static com.hackerrank.test.Masking.maskedNumber;
import static com.hackerrank.test.Tweets.Tweet.TweetComparator;

/**
 * Created by jackalhan on 1/14/17.
 */
public class Tweets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String timeDomain = sc.nextLine();
        sc.nextLine();


        List<String> l = new ArrayList<String>();

        while (sc.hasNextLine() == true) {
            l.add(sc.nextLine());
        }

        List<Tweet> tweets = filter(l, timeDomain);
        for (Tweet t : tweets) {

            String newLine = "";
            for (int i = 0; i < tweets.size(); i++) {
                if (tweets.get(i).getTime() == t.getTime()) {
                    if (!tweets.get(i).getText().equals(t.getText())) {
                        newLine = newLine + tweets.get(i).getText();
                        tweets.remove(tweets.get(i));
                    }
                }
            }
            System.out.println(t.getTimeText() + "," + t.getText() + ", " + newLine);

        }
    }

    public static List<Tweet> filter(List<String> allList, String timeDomain) {
        String[] timeDomains = timeDomain.split(",");

        int beginTime = convertTime(timeDomains[0]);
        int endTime = convertTime(timeDomains[1]);

        List<Tweet> newList = new ArrayList<Tweet>();

        for (int i = 0; i < allList.size(); i++) {
            String[] rowFields = allList.get(i).split(",");
            int rowTime = convertTime(rowFields[0].substring(0, 7));
            if ((rowTime <= endTime) && (rowTime >= beginTime)) {
                String newLine = "";
                for (int k = 1; k < rowFields.length; k++) {
                    newLine = newLine + rowFields[k] + ",";
                }
                Tweet tweet = new Tweet();
                tweet.setTime(rowTime);
                tweet.setTimeText(rowFields[0].substring(0, 7));
                tweet.setText(rowFields[1]);
                tweet.setQuantity(Integer.parseInt(rowFields[2]));
                newList.add(tweet);
            }
        }

        Collections.sort(newList, Tweet.TweetComparator);
        return newList;
    }


    static class Tweet implements Comparable<Tweet> {

        private int time;
        private String timeText;
        private String text;
        private int quantity;

        public Tweet() {
        }

        public Tweet(int time, String timeText, String text, int quantity) {
            super();
            this.time = time;
            this.timeText = timeText;
            this.text = text;
            this.quantity = quantity;
        }


        public String getTimeText() {
            return timeText;
        }

        public void setTimeText(String timeText) {
            this.timeText = timeText;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int compareTo(Tweet o) {
            int compare = ((Tweet) o).getTime();
            return compare - this.time;
        }

        public static Comparator<Tweet> TweetComparator
                = new Comparator<Tweet>() {

            public int compare(Tweet o1, Tweet o2) {
                int qtty1 = o1.getQuantity();
                int qtty2 = o2.getQuantity();
                return o2.compareTo(o1);
            }

        };
    }

    public static int convertTime(String time) {
        return Integer.parseInt(time.trim().replace("-", ""));


    }

}
