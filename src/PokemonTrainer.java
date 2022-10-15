import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private final String name;
    private List<Pokemon> pokemons = new ArrayList<>();

    GrassPokemon ditto = new GrassPokemon("Grass", "Ditto", 8, 130, "flowers", "hehi");
    GrassPokemon venusaur = new GrassPokemon("Grass", "Venusaur", 11, 140, "blades", "whaah");
    ElectricPokemon raichu = new ElectricPokemon("Electric", "Raichu", 9, 110, "thunder", "pieuw");
    WaterPokemon blastoise = new WaterPokemon("Water", "Blastoise", 6, 80, "saltwater", "blubblub");
    WaterPokemon gyarados = new WaterPokemon("Water", "Gyarados", 10, 90, "sparklingwater", "pssst");
    FirePokemon charizard = new FirePokemon("Fire", "Charizard", 12, 140, "firebrocks", "ghuuuh");



    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }


    public GrassPokemon getDitto() {
        return ditto;
    }
    public GrassPokemon getVenusaur() {
        return venusaur;
    }
    public ElectricPokemon getRaichu() {
        return raichu;
    }
    public WaterPokemon getBlastoise() {
        return blastoise;
    }
    public WaterPokemon getGyarados() {
        return gyarados;
    }
    public FirePokemon getCharizard() {
        return charizard;
    }


    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


}
