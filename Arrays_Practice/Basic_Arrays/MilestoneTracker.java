/*  Statement: You just launched a new portfolio project on Behance, and you are tracking your daily profile views. 
    You want to know exactly how many times your views actually grew compared to the previous day.

    Input array: int[] dailyViews = {50, 85, 70, 120, 150, 110};
    Expected output: 3 (because it went up on day 2, day 4, and day 5).

    The Goal: Create a counter variable. This time, start your loop at int i = 1 instead of 0. 
    Inside the loop, check if the current day's views (dailyViews[i]) is greater than yesterday's views (dailyViews[i - 1]). 
    If it is, add 1 to your counter. */

package Coding_Challenge.Arrays_Practice.Basic_Arrays;

public class MilestoneTracker {
    public static void main(String[] args){
        int[] dailyViews = {50, 85, 70, 120, 150, 110};
        int count = 0;
        for(int i=1; i<dailyViews.length; i++){
            if(dailyViews[i] > dailyViews[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
