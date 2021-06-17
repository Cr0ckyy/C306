package L1;

import java.util.ArrayList;
import c306.GUIHelper;

public class COEApp {
   private String[] menu = { 
         "Display Average Premium", 
         "Display Highest Premium", 
         "Display Lowest Premium",
         "Display Highest Difference between Two Consecutive Rounds", 
         "Display Month with the highest bidders",
         "Display Premium for Specified Year, Month and Round" };

   private Runnable[] action = { 
         this::displayAveragePremium, 
         this::displayHighestPremium,
         this::displayLowestPremium, 
         this::displayGreatestDifferenceInPremium,
         this::displayMonthWithMostBidders, 
         this::displayPremium };

   private ArrayList<BiddingResult> list;
   
   public COEApp() {
      CsvFileReader cfr = new CsvFileReader("coe.csv");
      list = cfr.getList();
      GUIHelper.showMenu("COE Application", menu, action);
   }

   private void displayHighestPremium() {
      // TODO L01 Task 1 - Calculate and Display Highest Premium
      
   }

   private void displayLowestPremium() {
      // TODO L01 Task 2 - Calculate and Display Lowest Premium
      
   }

   private void displayAveragePremium() {
      // TODO L01 Task 3 - Calculate and Display Average Premium
      
   }

   private void displayMonthWithMostBidders() {
      // TODO L01 Task 4 - Calculate and Display Month with the most bidders
   
   }

   private void displayPremium() {
      Integer year = GUIHelper.readInt("Enter Year ");
      if (year == null) {
         return;
      }
      String month = GUIHelper.readString("Enter Month ");
      if (month == null) {
         return;
      }
      Integer round = GUIHelper.readInt("Enter Round ");
      if (round == null) {
         return;
      }

      findPremium(year, month, round);

   }
   
   private void findPremium(int year, String month, int round) {
      // TODO L01 Task 5 - Find and Display Bidding Result
      
   }
   
   private void displayGreatestDifferenceInPremium() {
      // TODO L01 Task 6 - Calculate and Highest Difference between Two Consecutive Rounds
      
   }
   
   public static void main(String[] args) {
      new COEApp();
   }
}