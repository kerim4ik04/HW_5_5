public class Hero {
    int heroHealth;
    int heroDamage;
    String superAbility;
    private Hero(int heroDamage, String superAbility){
        this.heroDamage = heroDamage;
        this.superAbility = superAbility;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    private Hero (int heroHealth, int heroDamage, String superAbility){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superAbility = superAbility;
    }
}
