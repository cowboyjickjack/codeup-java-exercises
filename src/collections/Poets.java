package collections;

import java.util.ArrayList;
import java.util.List;

public class Poets {

    public static ArrayList<Poet> generatePoetList(){
        Poet shakespeare = new Poet("William Shakespeare", 1564, 1616, "Elizabethan");
        Poet rumi = new Poet("Rumi", 1207, 1273, "Persian");
        Poet tagore = new Poet("Rabindranath Tagore", 1861, 1941, "Bengali");
        Poet liBai = new Poet("Li Bai", 701, 762, "Chinese");
        Poet sappho = new Poet("Sappho", -630, -570, "Greek");
        Poet confucius = new Poet("Confucius", -551, -479, "Chinese");
        Poet dante = new Poet("Dante Alighieri", 1265, 1321, "Italian");
        Poet pushkin = new Poet("Alexander Pushkin", 1799, 1837, "Russian");
        Poet hafiz = new Poet("Hafez", 1315, 1390, "Persian");
        Poet kabir = new Poet("Kabir", 1440, 1518, "Hindi");
        Poet omarKhayyam = new Poet("Omar Khayyam", 1048, 1131, "Persian");
        Poet mirzaGhalib = new Poet("Mirza Ghalib", 1797, 1869, "Urdu");
        Poet emilyDickinson = new Poet("Emily Dickinson", 1830, 1886, "American");
        Poet pabloNeruda = new Poet("Pablo Neruda", 1904, 1973, "Chilean");
        Poet williamButlerYeats = new Poet("William Butler Yeats", 1865, 1939, "Irish");
        Poet mirTaqiMir = new Poet("Mir Taqi Mir", 1723, 1810, "Urdu");
        Poet liQingzhao = new Poet("Li Qingzhao", 1084, 1155, "Chinese");
        Poet williamBlake = new Poet("William Blake", 1757, 1827, "Romanticism");
        Poet lordByron = new Poet("Lord Byron", 1788, 1824, "Romanticism");
        Poet johnKeats = new Poet("John Keats", 1795, 1821, "Romanticism");
        Poet percyByssheShelley = new Poet("Percy Bysshe Shelley", 1792, 1822, "Romanticism");
        Poet williamWordsworth = new Poet("William Wordsworth", 1770, 1850, "Romanticism");
        Poet christinaRossetti = new Poet("Christina Rossetti", 1830, 1894, "Pre-Raphaelite");
        Poet elizabethBarrettBrowning = new Poet("Elizabeth Barrett Browning", 1806, 1861, "Victorian");
        Poet robertBrowning = new Poet("Robert Browning", 1812, 1889, "Victorian");
        Poet alfredTennyson = new Poet("Alfred Tennyson", 1809, 1892, "Victorian");
        Poet ezraPound = new Poet("Ezra Pound", 1885, 1972, "Modernism");
        Poet tS_Eliot = new Poet("T. S. Eliot", 1888, 1965, "Modernism");
        Poet dylanThomas = new Poet("Dylan Thomas", 1914, 1953, "Modernism");
        Poet philipLarkin = new Poet("Philip Larkin", 1922, 1985, "Movement");
        Poet johnDonne = new Poet("John Donne", 1572, 1631, "Metaphysical");
        Poet johnMilton = new Poet("John Milton", 1608, 1674, "Renaissance");
        Poet geoffreyChaucer = new Poet("Geoffrey Chaucer", 1343, 1400, "Middle English");
        Poet federicoGarciaLorca = new Poet("Federico García Lorca", 1898, 1936, "Generation of '27");
        Poet antonioMachado = new Poet("Antonio Machado", 1875, 1939, "Generation of '98");
        Poet federicoGuzman = new Poet("Federico Guzmán Rubio", 1955, 2011, "Generation of the 80s");
        return new ArrayList<>(List.of(shakespeare, rumi, tagore, liBai, sappho, confucius, dante, pushkin, hafiz, kabir, omarKhayyam, mirzaGhalib, emilyDickinson, williamBlake, lordByron, johnKeats, percyByssheShelley, williamWordsworth, christinaRossetti, elizabethBarrettBrowning, robertBrowning, alfredTennyson, ezraPound, tS_Eliot, dylanThomas, philipLarkin, johnDonne, johnMilton, geoffreyChaucer, federicoGarciaLorca, antonioMachado, federicoGuzman, mirTaqiMir, liQingzhao, pabloNeruda, williamButlerYeats));
    }
}
