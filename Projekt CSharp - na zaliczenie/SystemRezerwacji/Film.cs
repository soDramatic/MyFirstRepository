using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Film
    {
        private String tytul;
        private String gatunek;
        private int czasTrwania;
        public Film(String tytul, String gatunek, int czasTrwania)
        {
            this.tytul = tytul;
            this.gatunek = gatunek;
            this.czasTrwania = czasTrwania;
        }
        public String getTytul()
        {
            return tytul;
        }

    }
}
