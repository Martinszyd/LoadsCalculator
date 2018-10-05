class LogicsLB {

    String LBweight;
    String PeopleNo;
    private double weightOfLB;
    double weightInLB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;

    void weightInLbCalc() {
        double noOfPeople;
        if (LBweight!=null && PeopleNo!=null) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * 75 * 1.1);
        }
        else
            System.out.println("Wrong data at LB");
    }

    void totalWeightCalc() {
        weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
        totalWeight = weightOfLB + weightInLB;
    }

    void davitWeightCalc() {
        davitWeight = totalWeight;
    }
}
