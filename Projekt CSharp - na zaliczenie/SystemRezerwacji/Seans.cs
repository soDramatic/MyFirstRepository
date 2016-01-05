using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Seans
    {
        Film film;
        DateTime dataGodzina;
        public Seans(Film film, DateTime dataGodzina)
        {
            this.film = film;
            this.dataGodzina = dataGodzina;
        }
        public String toString()
        {
            return "Film: " + film.getTytul() + Environment.NewLine + dataGodzina.ToString();
        }
    }
}
