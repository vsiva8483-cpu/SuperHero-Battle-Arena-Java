package oops;
abstract class SuperHero {
    private String heroName;
    private int powerLevel;
    private int energy;

    SuperHero(String heroName, int powerLevel, int energy) {
        this.heroName = heroName;
        this.powerLevel = powerLevel;
        this.energy = energy;
    }

    abstract void attack();//abstract method1

    abstract void useUltimatePower();//abstract method2

    void showHeroDetails() {
        System.out.println("Hero name : " + heroName);
        System.out.println("Power Level  : " + powerLevel);
        System.out.println("Energy  : " + energy);
    }

    void rest() {
        energy+=20;
        System.out.println(heroName + "is resting....");
        System.out.println("Energy increased..!");
    }
    String getHeroName(){
        return heroName;
    }
    int getPowerLevel(){
        return powerLevel;
    }
    int getEnergy(){
        return energy;
    }
    void reduceEnergy(int amount){
        energy-=amount;
    }
}
//===========SPIDER HERO=========
 class SpiderHero extends SuperHero{
    String webType;
    SpiderHero(String heroName,int powerLevel,int energy,String webType){
        super(heroName,powerLevel,energy);
        this.webType=webType;
    }
    //override
    @Override
    void attack(){
        if(getEnergy()>=10){
            System.out.println(getHeroName()+"attacks using" + webType+"webs!");
            reduceEnergy(10);
        }
        else{
            System.out.println("Not Enough Energy!");
        }
    }

    @Override
    void useUltimatePower(){
        if(getEnergy()>=30){
            System.out.println(getHeroName()+"activated WEB STORM!");
            reduceEnergy(30);
        }
        else{
            System.out.println("Not enough Energy for ultimate Power!");
        }
    }
}
  class ThunderHero extends SuperHero{
    int lightningPower;
    ThunderHero(String heroName,int powerLevel,int energy,int lightningPower) {
        super(heroName, powerLevel, energy);
        this.lightningPower = lightningPower;
    }
    @Override
     void attack(){
        if(getEnergy()>=15){
        System.out.println(getHeroName()+"attacks with" + lightningPower+"V Lightning Strike!");
        reduceEnergy(15);
    }
    else{
        System.out.println("Not Enough Energy!");
    }

    }
    @Override
    void useUltimatePower(){
        if(getEnergy()>=40){
            System.out.println(getHeroName()+"activated THUNDER BLAST!");
            reduceEnergy(40);
        }
        else{
            System.out.println("Not Enough Energy for ultimate power!");
        }
    }
    }
 class ShadowHero extends SuperHero {
     String shadowMode;

     ShadowHero(String heroName, int powerLevel, int energy, String shadowMode) {
         super(heroName, powerLevel, energy);
         this.shadowMode = shadowMode;
     }

     @Override
     void attack() {
         if (getEnergy() >= 12) {
             System.out.println(getHeroName() + "attacks from shadows using " + shadowMode + "!");
             reduceEnergy(12);
         } else {
             System.out.println("Not Enough Energy!");
         }
     }

     @Override
     void useUltimatePower() {
         if (getEnergy() >= 35) {
             System.out.println(getHeroName() + "activated DARKNESS DOMAIN!");
             reduceEnergy(35);
         } else {
             System.out.println("Not Enough Energy For Ultimate Power");
         }
     }

         public static void main(String[] args) {
             SuperHero h1;
             SuperHero h2;
             SuperHero h3;
             h1 = new SpiderHero("Spider Fang", 90, 100, "Web Shadow");
             h2 = new ThunderHero("ThunderX", 95, 100, 300);
             h3 = new ShadowHero("Shadow Reaper", 89, 93, "Void Hunter");
             System.out.println("==========SUPER HERO ARENA=================");
             System.out.println();
             h1.showHeroDetails();
             h1.attack();
             h1.useUltimatePower();

             System.out.println("-------------------------------------------");

             h2.showHeroDetails();
             h2.attack();
             h2.useUltimatePower();

             System.out.println("--------------------------------------------");

             h3.showHeroDetails();
             h3.attack();
             h3.useUltimatePower();

             System.out.println("---------------------------------------------");

             h1.rest();
         }

     }
