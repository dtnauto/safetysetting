package com.example.safetysetting.view.base;

public class AdvanceItem {
    public int type;
    public String mTitle;
    public String mSValue;
    public boolean mBValue;

    public static class Builder{
        public int type;
        public String mTitle;
        public String mSValue;
        public boolean mBValue;


        public Builder(int type) {
            this.type = type;
        }
        public Builder(int type, String title) {
            this.type = type;
            this.mTitle = title;
        }

        public Builder addType(int type){
            this.type = type;
            return this;
        }

        public Builder addTitle(String title){
            this.mTitle = title;
            return this;
        }
        public Builder addSValue(String sValue){
            this.mSValue = sValue;
            return this;
        }
        public Builder addBValue(boolean bValue){
            this.mBValue = bValue;
            return this;
        }

        public AdvanceItem build(){
            AdvanceItem item = new AdvanceItem();
            item.type = this.type;
            item.mTitle = this.mTitle;
            item.mSValue = this.mSValue;
            item.mBValue = this.mBValue;
            return item;
        }
    }
}
