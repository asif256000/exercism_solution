public class GameMaster {

    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.",
                character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.",
                destination.getName(),
                destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        String travelMethodDescription = "You're traveling to your destination ";
        String method = "";
        switch (travelMethod) {
            case WALKING:
                method = "by walking.";
                break;
            case HORSEBACK:
                method = "on horseback.";
                break;
            default:
                method = "by walking.";
        }
        return travelMethodDescription + method;
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        String characterDescription = describe(character);
        String destinationDescription = describe(destination);
        String travelMethodDescription = describe(travelMethod);

        return String.format("%s %s %s",
                characterDescription,
                travelMethodDescription,
                destinationDescription);
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
