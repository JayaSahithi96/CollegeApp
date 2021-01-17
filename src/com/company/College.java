package com.company;

public class College {
        private long id;
        private String name;
        private String address;

        public College(){

        }
        public College(long id,String name,String address ){

            this.id= id;
            this.name= name;
            this.address= address;
        }
        public long getId(){
            return id;
        }
        public String getName(){
            return this.name;
        }
        public String getAddress(){
            return address;
        }
        public void printDetails(){
            System.out.println("college details:" +id+"/n"+name);
        }

    }





