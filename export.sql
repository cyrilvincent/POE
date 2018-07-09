--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4
-- Dumped by pg_dump version 10.4

-- Started on 2018-07-09 11:52:04

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2837 (class 1262 OID 12938)
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'French_France.1252' LC_CTYPE = 'French_France.1252';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2838 (class 0 OID 0)
-- Dependencies: 2837
-- Name: DATABASE postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 2 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 1 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 2841 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 202 (class 1259 OID 16422)
-- Name: author; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.author (
    id integer NOT NULL,
    firstname character varying(50) NOT NULL,
    lastname character varying(50)
);


ALTER TABLE public.author OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16420)
-- Name: author_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.author_id_seq OWNER TO postgres;

--
-- TOC entry 2842 (class 0 OID 0)
-- Dependencies: 201
-- Name: author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.author_id_seq OWNED BY public.author.id;


--
-- TOC entry 198 (class 1259 OID 16395)
-- Name: book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    id integer NOT NULL,
    title character varying(50) NOT NULL,
    price double precision NOT NULL,
    nbpage integer,
    publisherid integer
);


ALTER TABLE public.book OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16393)
-- Name: book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.book_id_seq OWNER TO postgres;

--
-- TOC entry 2843 (class 0 OID 0)
-- Dependencies: 197
-- Name: book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book_id_seq OWNED BY public.book.id;


--
-- TOC entry 203 (class 1259 OID 16428)
-- Name: bookauthor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bookauthor (
    bookid integer NOT NULL,
    authorid integer NOT NULL
);


ALTER TABLE public.bookauthor OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16403)
-- Name: publisher; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.publisher (
    id integer NOT NULL,
    name character varying(50) NOT NULL
);


ALTER TABLE public.publisher OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 16401)
-- Name: publisher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.publisher_id_seq OWNER TO postgres;

--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 199
-- Name: publisher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.publisher_id_seq OWNED BY public.publisher.id;


--
-- TOC entry 2689 (class 2604 OID 16425)
-- Name: author id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.author ALTER COLUMN id SET DEFAULT nextval('public.author_id_seq'::regclass);


--
-- TOC entry 2687 (class 2604 OID 16398)
-- Name: book id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book ALTER COLUMN id SET DEFAULT nextval('public.book_id_seq'::regclass);


--
-- TOC entry 2688 (class 2604 OID 16406)
-- Name: publisher id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publisher ALTER COLUMN id SET DEFAULT nextval('public.publisher_id_seq'::regclass);


--
-- TOC entry 2830 (class 0 OID 16422)
-- Dependencies: 202
-- Data for Name: author; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.author VALUES (1, 'Cyril', 'Vincent
');
INSERT INTO public.author VALUES (2, 'Victor', 'Hugo');


--
-- TOC entry 2826 (class 0 OID 16395)
-- Dependencies: 198
-- Data for Name: book; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.book VALUES (2, 'Python', 10, 50, 2);
INSERT INTO public.book VALUES (3, 'Postgres', 15, NULL, 1);
INSERT INTO public.book VALUES (4, 'Angular', 18, 55, 2);
INSERT INTO public.book VALUES (1, 'Java', 20.899999999999999, 99, 1);
INSERT INTO public.book VALUES (5, 'sql', 25.300000000000001, 98, NULL);


--
-- TOC entry 2831 (class 0 OID 16428)
-- Dependencies: 203
-- Data for Name: bookauthor; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.bookauthor VALUES (1, 1);
INSERT INTO public.bookauthor VALUES (2, 2);
INSERT INTO public.bookauthor VALUES (3, 1);
INSERT INTO public.bookauthor VALUES (3, 2);
INSERT INTO public.bookauthor VALUES (4, 1);
INSERT INTO public.bookauthor VALUES (2, 1);


--
-- TOC entry 2828 (class 0 OID 16403)
-- Dependencies: 200
-- Data for Name: publisher; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.publisher VALUES (1, 'ENI');
INSERT INTO public.publisher VALUES (2, 'Cyril');


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 201
-- Name: author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.author_id_seq', 2, true);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 197
-- Name: book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book_id_seq', 5, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 199
-- Name: publisher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.publisher_id_seq', 2, true);


--
-- TOC entry 2696 (class 2606 OID 16427)
-- Name: author author_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.author
    ADD CONSTRAINT author_pkey PRIMARY KEY (id);


--
-- TOC entry 2691 (class 2606 OID 16400)
-- Name: book book_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (id);


--
-- TOC entry 2698 (class 2606 OID 16432)
-- Name: bookauthor bookauthor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT bookauthor_pkey PRIMARY KEY (bookid, authorid);


--
-- TOC entry 2694 (class 2606 OID 16408)
-- Name: publisher publisher_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publisher
    ADD CONSTRAINT publisher_pkey PRIMARY KEY (id);


--
-- TOC entry 2699 (class 1259 OID 16444)
-- Name: fki_fk_bookauthor_author; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_bookauthor_author ON public.bookauthor USING btree (authorid);


--
-- TOC entry 2700 (class 1259 OID 16438)
-- Name: fki_fk_bookauthor_book; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_bookauthor_book ON public.bookauthor USING btree (bookid);


--
-- TOC entry 2692 (class 1259 OID 16419)
-- Name: fki_fk_publisherid_id; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_publisherid_id ON public.book USING btree (publisherid);


--
-- TOC entry 2703 (class 2606 OID 16439)
-- Name: bookauthor fk_bookauthor_author; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT fk_bookauthor_author FOREIGN KEY (authorid) REFERENCES public.author(id);


--
-- TOC entry 2702 (class 2606 OID 16433)
-- Name: bookauthor fk_bookauthor_book; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT fk_bookauthor_book FOREIGN KEY (bookid) REFERENCES public.book(id);


--
-- TOC entry 2701 (class 2606 OID 16414)
-- Name: book fk_publisherid_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT fk_publisherid_id FOREIGN KEY (publisherid) REFERENCES public.publisher(id);


-- Completed on 2018-07-09 11:52:04

--
-- PostgreSQL database dump complete
--

