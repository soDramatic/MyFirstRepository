using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class KlientZarejestrowany : KlientNiezarejestrowany
    {
        private int ilePunktow;
        private String eMail;
        public KlientZarejestrowany(String imie, String nazwisko, String nrTelefonu, String eMail) :base (imie,nazwisko,nrTelefonu)
        {
            this.ilePunktow = 0;
            this.eMail = eMail;
        }
        public void dodajPunkty(int ile)
        {
            ilePunktow += ile;
        }
        public String toString()
        {
            return imie + " " + nazwisko;
        }
    }
}
