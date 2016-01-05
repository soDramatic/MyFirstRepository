using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Rezerwacja
    {
        KlientZarejestrowany klient;
        Seans seans;
        int iloscMiejsc;
        Prowiant prowiant;
        Sala sala;
        public Rezerwacja(KlientZarejestrowany klient, Seans seans, int iloscMiejsc, Prowiant prowiant, Sala sala)
        {
            this.klient = klient;
            this.seans = seans;
            this.iloscMiejsc = iloscMiejsc;
            this.prowiant = prowiant;
            this.sala = sala;
            dodajPunkty();
            rezerwujMiejsca();
        }
        void dodajPunkty()
        {
            if(klient is KlientZarejestrowany)
            {
                klient.dodajPunkty(10);
            }
        }
        void rezerwujMiejsca()
        {
            sala.rezerwuj(iloscMiejsc);
        }
        public String toString()
        {
            return ("Klient: " + klient.toString() + Environment.NewLine + "Seans: " + seans.toString() + Environment.NewLine + "Prowiant:" + prowiant.toString());
        }
    }
}
