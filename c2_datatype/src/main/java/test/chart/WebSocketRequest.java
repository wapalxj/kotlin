package test.chart;//package com.datatype.test.chart;
//
//import java.util.List;
//
//public class WebSocketRequest {
//
//    public static void main(String[] args) {
//        System.out.println("asdsadasdasdasd");
//    }
//    private int Type;
//    private Mt4Account Identity;
//
//    //1.当Type为ActionType_Status_Check时 Data需要传入一个账户数组：[]Mt4Account，表示需要Check哪些账户的状态
//    //2.当Type为ActionType_Quote_Symbols时，可以限制推送报价的品种数量：
//    //Identity指定账户，
//    //Data指定需要推送报价的品种列表（类型为数组），空表示不限制，即推送所有品种的报价。
//    private List<Object> Data;
//
//    public int getType() {
//        return Type;
//    }
//
//    public void setType(int type) {
//        Type = type;
//    }
//
//    public Mt4Account getIdentity() {
//        return Identity;
//    }
//
//    public void setIdentity(Mt4Account identity) {
//        Identity = identity;
//    }
//
//    public List<Object> getData() {
//        return Data;
//    }
//
//    public void setData(List<Object> data) {
//        Data = data;
//    }
//
//    public static class Mt4Account {
//        private int BrokerID;
//        private String Account;
//
//        public Mt4Account() {
//
//        }
//
//        public Mt4Account(int brokerID, String account) {
//            BrokerID = brokerID;
//            Account = account;
//        }
//
//        public int getBrokerID() {
//            return BrokerID;
//        }
//
//        public void setBrokerID(int brokerID) {
//            BrokerID = brokerID;
//        }
//
//        public String getAccount() {
//            return Account;
//        }
//
//        public void setAccount(String account) {
//            Account = account;
//        }
//
//        @Override
//        public String toString() {
//            return "Mt4Account{" +
//                    "BrokerID=" + BrokerID +
//                    ", Account='" + Account + '\'' +
//                    '}';
//        }
//    }
//}
//
