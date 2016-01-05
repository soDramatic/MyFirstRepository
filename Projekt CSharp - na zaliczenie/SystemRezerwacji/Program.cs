using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SystemRezerwacji
{
    class Program
    {
        static void Main(string[] args)
        {
            Sala sala = new Sala(300);
            Seans seans = new Seans(new Film("W pustyni i w puszczy", "przygodowy", 140), new DateTime(2000, 12, 3, 20, 00, 00));
            KlientZarejestrowany kn = new KlientZarejestrowany("Jan", "Kowalski", "111222333","jan@kowalski.com");
            Rezerwacja rezerwacja = new Rezerwacja(kn, seans, 4, new Prowiant(2, 0, 0, 2), sala);
            System.Console.WriteLine("Rezerwacja zatwierdzona");
            System.Console.WriteLine(rezerwacja.toString());
            System.Console.ReadKey();

        }
    }
}
