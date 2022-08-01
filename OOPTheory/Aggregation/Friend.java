package Aggregation;
public class Friend extends Human {
        private int friendSince;
        private String friendFrom; // school , work

        public void setFriendSince(int year){
                this.friendSince = year;
        }
        public void setFriendFrom(String place){
                this.friendFrom = place;
        }
        public int getFriendSince(){
                return friendSince;
        }
        public String getFriendFrom(){
                return friendFrom;
        }
}
