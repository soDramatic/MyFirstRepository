using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Sala : Pomieszczenie, RezerwacjaMiejsc, MiejscaWolne
    {
        private int iloscMiejsc;
        private int iloscMiejscZajetych;

        public Sala(int iloscMiejsc)
        {
            this.iloscMiejsc = iloscMiejsc;
            this.iloscMiejscZajetych = 0;
        }
        public int iloscMiejscWolnych()
        {
            return iloscMiejsc - iloscMiejscZajetych;
        }
        public void rezerwuj(int ile)
        {
            if(iloscMiejscZajetych + ile < iloscMiejsc)
            {
                iloscMiejscZajetych += ile;
            }
        }
    }
}
