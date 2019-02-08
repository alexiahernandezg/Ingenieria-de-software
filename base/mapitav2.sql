--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)

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
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: marcador; Type: TABLE; Schema: public; Owner: alexia
--

CREATE TABLE public.marcador (
    idmarcador integer NOT NULL,
    descripcion text,
    longitud double precision,
    latitud double precision,
    idusuario integer NOT NULL
);


ALTER TABLE public.marcador OWNER TO alexia;

--
-- Name: usuario; Type: TABLE; Schema: public; Owner: alexia
--

CREATE TABLE public.usuario (
    idusuario integer NOT NULL,
    nombre text NOT NULL,
    correo text NOT NULL,
    contrasenia text NOT NULL,
    fechanacimiento date NOT NULL
);


ALTER TABLE public.usuario OWNER TO alexia;

--
-- Name: usuario_idusuario_seq; Type: SEQUENCE; Schema: public; Owner: alexia
--

CREATE SEQUENCE public.usuario_idusuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuario_idusuario_seq OWNER TO alexia;

--
-- Name: usuario_idusuario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: alexia
--

ALTER SEQUENCE public.usuario_idusuario_seq OWNED BY public.usuario.idusuario;


--
-- Name: usuario idusuario; Type: DEFAULT; Schema: public; Owner: alexia
--

ALTER TABLE ONLY public.usuario ALTER COLUMN idusuario SET DEFAULT nextval('public.usuario_idusuario_seq'::regclass);


--
-- Data for Name: marcador; Type: TABLE DATA; Schema: public; Owner: alexia
--

COPY public.marcador (idmarcador, descripcion, longitud, latitud, idusuario) FROM stdin;
\.


--
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: alexia
--

COPY public.usuario (idusuario, nombre, correo, contrasenia, fechanacimiento) FROM stdin;
1	Jhon	jhon@correocliente.com	qwerty	1995-03-16
\.


--
-- Name: usuario_idusuario_seq; Type: SEQUENCE SET; Schema: public; Owner: alexia
--

SELECT pg_catalog.setval('public.usuario_idusuario_seq', 1, true);


--
-- Name: marcador marcador_pkey; Type: CONSTRAINT; Schema: public; Owner: alexia
--

ALTER TABLE ONLY public.marcador
    ADD CONSTRAINT marcador_pkey PRIMARY KEY (idmarcador);


--
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: alexia
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (idusuario);


--
-- Name: marcador marcador_idusuario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: alexia
--

ALTER TABLE ONLY public.marcador
    ADD CONSTRAINT marcador_idusuario_fkey FOREIGN KEY (idusuario) REFERENCES public.usuario(idusuario);


--
-- PostgreSQL database dump complete
--

