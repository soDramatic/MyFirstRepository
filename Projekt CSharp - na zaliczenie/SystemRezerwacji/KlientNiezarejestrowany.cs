using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class KlientNiezarejestrowany
    {
        protected String imie;
        protected String nazwisko;
        protected String nrTelefonu;
        public KlientNiezarejestrowany(String imie, String nazwisko, String nrTelefonu)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nrTelefonu = nrTelefonu;
        }
    }
}
