package com.bookmyshow;

import com.bookmyshow.enums.City;
import com.bookmyshow.enums.SeatCategory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;
  //  BookMyShowData bookMyShowData;
    public BookMyShow()
    {
        movieController = new MovieController();
        theatreController = new TheatreController();
        //bookMyShowData = new BookMyShowData();
    }

    public void Initialize()
    {
        CreateMovie();
        CreateTheatre();

    }

    public void CreateBooking(City city, String movieName)
    {
        //find out the interested movie using moviename
        Movie interestedMovie = movieController.GetMovieByName(movieName);

        interestedMovie.printMovie();

        System.out.println("-----------------------------");
        //find all the theatres in that city running that movie;
        Map<Theatre, List<MovieShow>>  theatresInACity = theatreController.GetAllShow(city,interestedMovie);

        for (Map.Entry<Theatre, List<MovieShow>> entry : theatresInACity.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " );

            for(MovieShow show : entry.getValue())
            {
                show.printMovieShow();
            }
            System.out.println();
        }
        //now select a theatre and a show from this map
        Map.Entry<Theatre,List<MovieShow>> entry =  theatresInACity.entrySet().iterator().next();
        List<MovieShow> AvailableShowsInSelectedTheatre = entry.getValue();
        MovieShow interestedShow = AvailableShowsInSelectedTheatre.get(0);

        //create a booking
        int selectedSeatID1 = 31;
        int selectedSeatID2 = 32;

        List<Integer> alreadyBookSeats = interestedShow.getBookedSeats();
        if(!alreadyBookSeats.contains(selectedSeatID1))
        {
            alreadyBookSeats.add(selectedSeatID1);
            alreadyBookSeats.add(selectedSeatID2);

            //get screen for that show
            Screen screen = interestedShow.getScreen();
            Seat s1=   screen.GetSeatByID(selectedSeatID1);
            Seat s2 = screen.GetSeatByID(selectedSeatID2);

            //Select the seats
            List<Seat> selectedSeats = new ArrayList<Seat>();
            selectedSeats.add(s1);
            selectedSeats.add(s2);

            Booking booking = new Booking(interestedShow,selectedSeats,new Payment());
        }
        else
        {
            System.out.println("Oops! the seat is already booked");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");

    }

    public void CreateMovie()
    {
        Movie movie1 = new Movie(1,"3 Idiots",120);
        Movie movie2 = new Movie(2,"Jab We Met",150);
        Movie movie3 = new Movie(3,"Dunki", 132);
        Movie movie4 = new Movie(4,"Article 370",153);

        movieController.AddMovieInCity(movie1, City.DELHI);
        movieController.AddMovieInCity(movie2,City.DELHI);
        movieController.AddMovieInCity(movie3,City.DELHI);
        movieController.AddMovieInCity(movie4,City.DELHI);
        movieController.AddMovieInCity(movie2,City.NOIDA);
        movieController.AddMovieInCity(movie3,City.NOIDA);
        movieController.AddMovieInCity(movie3,City.FARIDABAD);
        movieController.AddMovieInCity(movie4,City.FARIDABAD);
        movieController.AddMovieInCity(movie4,City.GURGAON);
        movieController.AddMovieInCity(movie1,City.GURGAON);
        movieController.AddMovieInCity(movie1,City.GHAZIABAD);
        movieController.AddMovieInCity(movie2,City.GHAZIABAD);


    }

    public void CreateTheatre()
    {
        Movie movie1 = movieController.GetMovieByName("3 Idiots");
        Movie movie2 = movieController.GetMovieByName("Jab We Met");

        Theatre theatre1 = new Theatre(1,"PVR",City.DELHI);
        theatre1.setScreenList(CreateScreens());

        List<MovieShow> movieShowList1 = new ArrayList<MovieShow>();
        MovieShow movieShow1 = new MovieShow(1,
                movie1,
                theatre1.getScreenList().get(0),
                LocalDateTime.of(2024, 3, 20, 13, 0));

        MovieShow movieShow2 = new MovieShow(2,
                movie2,
                theatre1.getScreenList().get(1),
                LocalDateTime.of(2024, 3, 20, 17, 0));

        movieShowList1.add(movieShow1);
        movieShowList1.add(movieShow2);
        theatre1.setMovieShowList(movieShowList1);



        Theatre theatre2 = new Theatre(2,"PVR",City.NOIDA);
        theatre1.setScreenList(CreateScreens());

        List<MovieShow> movieShowList2 = new ArrayList<MovieShow>();
        MovieShow movieShow3 = new MovieShow(1,
                movie1,
                theatre1.getScreenList().get(0),
                LocalDateTime.of(2024, 3, 20, 12, 5));

        MovieShow movieShow4 = new MovieShow(2,
                movie2,
                theatre1.getScreenList().get(1),
                LocalDateTime.of(2024, 3, 20, 16, 10));

        movieShowList2.add(movieShow3);
        movieShowList2.add(movieShow4);
        theatre1.setMovieShowList(movieShowList2);

        theatreController.AddTheatreInACity(City.DELHI,theatre1);
        theatreController.AddTheatreInACity(City.DELHI,theatre2);
        theatreController.AddTheatreInACity(City.NOIDA,theatre1);
        theatreController.AddTheatreInACity(City.NOIDA,theatre2);

    }



    public List<Screen> CreateScreens()
    {
        List<Screen> screenList = new ArrayList<Screen>();

        Screen screen1 = new Screen(1,CreateSeats());
        Screen screen2 = new Screen(2,CreateSeats());
        screenList.add(screen1);
        screenList.add(screen2);

        return  screenList;
    }

    public List<Seat> CreateSeats()
    {
        SeatFactory seatFactory = new SeatFactory();
        List<Seat> seatList = new ArrayList<Seat>();

        for(int i=1;i<=40;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.SILVER));

        for(int i=41;i<=80;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.GOLD));

        for(int i=81;i<=100;i++)
            seatList.add(seatFactory.GetSeat(i, SeatCategory.PLATINUM));

        return  seatList;
    }



    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.Initialize();

        bookMyShow.CreateBooking(City.DELHI, "3 Idiots");

    }
}
