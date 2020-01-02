package id.ac.poliban.mi.indrawan.listklubsepakbola;

import java.util.ArrayList;
import java.util.List;

public class ClubData {
    static List<Club> getAllClubs(){
        List<Club> data = new ArrayList<>();
        {
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/5/53/Arsenal_FC.svg/180px-Arsenal_FC.svg.png",
                    "Arsenal","Arsenal Football Club is a professional football club based in Islington, London, England, that plays in the Premier League, the top flight of English football. The club has won 13 League titles, a record 13 FA Cups, 2 League Cups, 15 FA Community Shields, 1 League Centenary Trophy, 1 UEFA Cup Winners' Cup and 1 Inter-Cities Fairs Cup."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/f/f9/Aston_Villa_FC_crest_%282016%29.svg/150px-Aston_Villa_FC_crest_%282016%29.svg.png",
                    "Aston Villa","Aston Villa Football Club (nicknamed Villa)[5] is an English professional football club based in Aston, Birmingham. The club competes in the Premier League, the top tier of the English football league system. Founded in 1874, they have played at their home ground, Villa Park, since 1897. Aston Villa were one of the founder members of the Football League in 1888 and of the Premier League in 1992.[6] Villa are one of only five English clubs to have won the European Cup, in 1981–82. They have also won the Football League First Division seven times, the FA Cup seven times, the League Cup five times, and the UEFA Super Cup once."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/e/e5/AFC_Bournemouth_%282013%29.svg/170px-AFC_Bournemouth_%282013%29.svg.png",
                    "Bournemouth","Athletic Football Club Bournemouth (/ˈbɔːrnməθ/ (About this soundlisten)), often abbreviated as simply Bournemouth, is a professional football club in Kings Park, Boscombe, a suburb of Bournemouth, Dorset, that plays in the Premier League, the top tier of the English football league system. Formed in 1890 as Boscombe St. John's Institute F.C., the club adopted their current name in 1972. Nicknamed The Cherries, since 1910 Bournemouth have played their home games at Dean Court. Their home colours are red and black striped shirts, with black shorts and socks, inspired by that of Italian club A.C. Milan."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/f/fd/Brighton_%26_Hove_Albion_logo.svg/200px-Brighton_%26_Hove_Albion_logo.svg.png",
                    "Brighton & Hove Albion","Brighton & Hove Albion Football Club (/ˈbraɪtən ... ˈhoʊv/), commonly referred to as Brighton, is an English professional football club based in the city of Brighton. They compete in the Premier League, the top tier of the English football league system. The club's home ground is the 30,750-capacity[1] Falmer Stadium, situated in Falmer to the north east of the city."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/6/62/Burnley_F.C._Logo.svg/180px-Burnley_F.C._Logo.svg.png",
                    "Burnley","Burnley Football Club (/ˈbɜːrnli/) is a professional association football club based in Burnley, Lancashire, England. Founded on 18 May 1882, the team originally played only friendly matches until they entered the FA Cup for the first time in 1885–86. The club currently plays in the Premier League, the first tier of English football. Nicknamed the Clarets, due to the dominant colour of their home shirts, they were one of the twelve founding members of the Football League in 1888. The club's emblem is based on the town's crest, with a Latin motto Pretiumque et Causa Laboris (\"The Prize and the Cause of [Our] Labour\")."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/c/cc/Chelsea_FC.svg/180px-Chelsea_FC.svg.png",
                    "Chelsea","Chelsea Football Club are an English professional football club based in Fulham, London. Founded in 1905, they compete in the Premier League, the top division of English football. Chelsea are among England's most successful clubs; they have been league champions six times and won over thirty competitive honours, including six European trophies. Their home ground is Stamford Bridge.[4]"));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Crystal_Palace_FC_logo.svg/170px-Crystal_Palace_FC_logo.svg.png",
                    "Crystal Palace","Crystal Palace Football Club is an English professional football club based in Selhurst, South London, that competes in the Premier League, the highest level of English football. They were founded in 1905 at the famous Crystal Palace Exhibition building and played their home games at the FA Cup Final stadium, which was situated inside the historic Palace grounds. The club were forced to leave the Palace in 1915 due to the outbreak of the First World War, and played at Herne Hill Velodrome and the Nest until 1924, when they moved to their current home at Selhurst Park."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/7/7c/Everton_FC_logo.svg/220px-Everton_FC_logo.svg.png",
                    "Everton","Everton Football Club (/ˈɛvərtən/) is an English professional football club based in Liverpool that competes in the Premier League, the top tier of English football. The club has competed in the top division for a record 116 seasons, missing the top division only four times (1930–31, 1951–52, 1952–53, and 1953–54) since The Football League was created in 1888. The club has won the League Championship nine times (fourth most), the FA Cup five times (ninth most), and the UEFA Cup Winners Cup once."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/2/2d/Leicester_City_crest.svg/180px-Leicester_City_crest.svg.png",
                    "Leichester City","Leicester City Football Club is an English professional football club based in Leicester in the East Midlands. The club competes in the Premier League, England's top division of football, and plays its home games at the King Power Stadium.[2]\n" +
                    "\n" +
                    "The club was founded in 1884 as Leicester Fosse F.C.,[3] playing on a field near Fosse Road. They moved to Filbert Street in 1891, were elected to the Football League in 1894 and adopted the name Leicester City in 1919. They moved to the nearby Walkers Stadium in 2002,[4] which was renamed the King Power Stadium in 2011."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/180px-Liverpool_FC.svg.png",
                    "Liverpool","Liverpool Football Club is a professional football club in Liverpool, England, that competes in the Premier League, the top tier of English football. The club has won six European Cups, more than any other English club, three UEFA Cups and four UEFA Super Cups, also English records, eighteen League titles, seven FA Cups, a record eight League Cups and fifteen FA Community Shields."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/180px-Manchester_City_FC_badge.svg.png",
                    "Manchester City","Manchester City Football Club is an English football club based in Manchester, that competes in the Premier League, the top flight of English football. Founded in 1880 as St. Mark's (West Gorton), it became Ardwick Association Football Club in 1887 and Manchester City in 1894. The club's home ground is the City of Manchester Stadium in east Manchester, to which it moved in 2003, having played at Maine Road since 1923."));
            data.add(new Club("https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/180px-Manchester_United_FC_crest.svg.png",
                    "Manchester United","Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\", the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910."));
            data.add(new Club("",
                    "Newcastle United",""));
            data.add(new Club("",
                    "Norwich City",""));
            data.add(new Club("",
                    "Sheffield United",""));
            data.add(new Club("",
                    "Southampton",""));
            data.add(new Club("",
                    "Tottenham Hotspur",""));
            data.add(new Club("",
                    "Watford",""));
            data.add(new Club("",
                    "West Ham United",""));
            data.add(new Club("",
                    "Wolverhampton Wanderers",""));
        }
        return data;
    }
}
