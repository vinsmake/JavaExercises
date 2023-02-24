class Account {
        private int code;
        private int agency;
        private double balance;
        private Client client = new Client();

        public Account(int agency) { //this account is automatly created, but you can declare it to modofy it.
                if (agency <= 0) {
                        System.out.println("Invalid agency id");
                        this.agency = 1;
                } else {
                        this.agency = agency;
                }
        }

        public Account() {
        }

        //amount///////////////////////////////////////////////////////////////////
        //deposit method
        public void deposit(double amount){
                this.balance = this.balance + amount;
        }

        //withdraw method
        public boolean withdraw(double amount){
                if (this.balance >= amount){
                this.balance = this.balance - amount;
                return true;
                }else{
                        return false;
                }//if
        }//withdraw

        //transfer method
        public boolean transfer(double amount, Account receiver){
                if (this.balance >= amount){
                        this.withdraw(amount);
                        receiver.deposit(amount);
                        return true;
                        }//if
                        return false;
        } //transfer

        //get balance
        public double getBalance() {
                return this.balance;
        }

        //agency////////////////////////////////////////////////////////////////////
        //setAgency
        public void setAgency(int agencyId){
                if (agencyId > 0){
                this.agency = agencyId;
                } else {
                        System.out.println("invalid agency id");
                }
        }
        //getAgency
        public int getAgency() {
        return agency;
        }

        //code//////////////////////////////////////////////////////////////////////
        //get code
        public int getCode() {
                return this.code;
        }

        //set code
        public void setCode(int code) {
                this.code = code;
        }

        
        
        public Client getClient() {
            return client;
        }
        public void setClient(Client client) {
            this.client = client;
        }
}//account

